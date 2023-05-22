package com.example.venta.feign;

import com.example.venta.dto.Cliente;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.apache.http.HttpStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cliente-service", path = "/cliente")
public interface ClienteFeign {
   // @CircuitBreaker(name = "clienteCB", fallbackMethod = "fallBackGetCliente")
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listById(@PathVariable(required = true) Integer id);
   /* private ResponseEntity<Object> fallBackGetCliente(@PathVariable(required = true) Integer id, RuntimeException e) {
        System.out.println("==========fallback");
        Cliente cliente= Cliente.builder()
                .apellidoMaterno("none")
                .build();
        return ResponseEntity.ok().body(new Object());
    }*/
}
