package com.catalinaa.explorador_de_recetas.controladores;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class ControladorRecetas {

    private static String[] listaRecetas = { "Pizza", "Espagueti", "Lasaña" };
    private static HashMap<String, String []> recetasConIngredientes = new HashMap<String, String[]>();

    public ControladorRecetas() {
	String [] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
	recetasConIngredientes.put("Pizza", pizza);
	String [] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
	recetasConIngredientes.put("Espagueti", espagueti);
	String [] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
	recetasConIngredientes.put("Lasaña", lasaña);
    }

    @GetMapping("/recetas")
    // Lista de recetas
    public String obtenerTodasLasRecetas(Model modelo) {
        modelo.addAttribute("listaRecetas", listaRecetas);
        return "recetas.jsp";
    }

    @GetMapping("/recetas/{nombre}")
    // Receta por nombre
    public String obtenerRecetaPorNombre(@PathVariable String nombre, Model modelo) {

    if (recetasConIngredientes.containsKey(nombre)) {
        modelo.addAttribute("nombre", nombre);
        modelo.addAttribute("ingredientes", recetasConIngredientes.get(nombre));
    } else {
        modelo.addAttribute("mensaje", "La receta no se encuentra en nuestra lista.");
    }

    return "detalleReceta.jsp";
}
}
