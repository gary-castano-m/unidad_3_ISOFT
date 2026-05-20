# Unidad 3 INGENIERIA DE SOFTWARE
# Sistema de Nómina en Java

Proyecto académico desarrollado para la asignatura Ingeniería de Software.

## Descripción

Este proyecto consiste en el desarrollo de un sistema de nómina utilizando el paradigma de Programación Orientada a Objetos en Java. El sistema permite gestionar diferentes tipos de empleados y calcular automáticamente salarios, beneficios y deducciones según las reglas de negocio establecidas.

El proyecto implementa conceptos fundamentales de POO como:

- Abstracción
- Herencia
- Encapsulamiento
- Polimorfismo

Además, se aplican principios SOLID, técnicas de Clean Code, refactorización y buenas prácticas de desarrollo de software.

---

# Características del Sistema

El sistema permite gestionar los siguientes tipos de empleados:

## Empleado Asalariado
- Salario fijo mensual
- Bono del 10% si tiene más de 5 años en la empresa
- Bono de alimentación

## Empleado por Horas
- Pago por horas trabajadas
- Pago de horas extras al 150%
- Acceso a fondo de ahorro si cumple condiciones

## Empleado por Comisión
- Salario base
- Comisión por ventas
- Bono adicional si supera el límite de ventas establecido
- Bono de alimentación

## Empleado Temporal
- Salario fijo mensual
- Contrato por tiempo definido
- Sin beneficios adicionales

---

# Tecnologías Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- PlantUML

---

# Principios Aplicados

## Programación Orientada a Objetos
- Clases abstractas
- Herencia
- Polimorfismo
- Encapsulamiento

## Principios SOLID
- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle

## Clean Code
- Nombres descriptivos
- Eliminación de números mágicos
- Métodos pequeños y reutilizables
- Separación de responsabilidades

---

# Estructura del Proyecto

```text
src
 └── co.edu.nomina
      ├── model
      │     ├── Empleado.java
      │     ├── EmpleadoAsalariado.java
      │     ├── EmpleadoPorHoras.java
      │     ├── EmpleadoPorComision.java
      │     └── EmpleadoTemporal.java
      │
      ├── service
      │     └── NominaService.java
      │
      ├── util
      │     └── ConstantesNomina.java
      │
      ├── main
      │     └── Main.java
      │
      └── test