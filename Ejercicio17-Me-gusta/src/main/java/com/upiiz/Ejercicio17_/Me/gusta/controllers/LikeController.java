package com.upiiz.Ejercicio17_.Me.gusta.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/posts")
public class LikeController {

    // Mapa concurrente para almacenar los contadores
    private final ConcurrentHashMap<Integer, AtomicInteger> likesMap = new ConcurrentHashMap<>();

    @PostMapping("/{imageId}/like")
    public String likeImage(@PathVariable int imageId) {
        // Incrementar el contador (lo crea si no existe)
        int newCount = likesMap
                .computeIfAbsent(imageId, k -> new AtomicInteger(0))
                .incrementAndGet();

        return String.valueOf(newCount);
    }

    @GetMapping("/{imageId}/counters")
    public String getCounters(@PathVariable int imageId) {
        // Obtener el contador (0 si no existe)
        int count = likesMap.getOrDefault(imageId, new AtomicInteger(0)).get();
        return String.valueOf(count);
    }
}
