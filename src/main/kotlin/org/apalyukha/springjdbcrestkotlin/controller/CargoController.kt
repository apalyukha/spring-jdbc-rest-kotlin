package org.apalyukha.springjdbcrestkotlin.controller

import org.apalyukha.springjdbcrestkotlin.dto.CargoDto
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cargo")
class CargoController {

    @GetMapping
    fun getAll(): List<CargoDto> =
        listOf(
            CargoDto(
                id = 1,
                title = "Gaz",

                )
        )

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): CargoDto =
        CargoDto(
            id = 1,
            title = "Gaz",

            )
    @PostMapping
    fun create(@RequestBody dto: CargoDto) {

    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody dto: CargoDto) {

    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Int) {

    }
}
