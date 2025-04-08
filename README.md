# S01.01-InheritancePolymorphism_Level03

---

# ENGLISH
___

# 📄 Description - Exercise Statement

This application simulates the internal management of a sports news editorial office. News articles are classified by sports categories: Football, Basketball, Tennis, F1, and Motorcycling.

## 🧑‍💼 Editors

- The newsroom can have multiple editors.
- Each editor has a **name**, a **DNI** (national ID), and a **salary**.
- Once assigned, the **DNI cannot be changed**.
- All editors share the **same salary**. If the company increases it, it will affect all editors equally.
- Current salary: **1500 €**.

## 📰 News

- Each editor can work on **multiple news articles**.
- Each news article includes:
  - A **headline**
  - A **text** (initially empty)
  - A **score**
  - A **price**
- There is a method `calculateNewsPrice()` to compute the price based on rules described below.

### 🏟️ Football News

Additional attributes:
- **Competition** (`String`)
- **Club** (`String`)
- **Player** (`String`)

**Price Calculation**:
- Base price: 300 €
- Champions League: +100 €
- Club is Barça or Madrid: +100 €
- Player is Ferran Torres or Benzema: +50 €

**Score Calculation**:
- Base score: 5 points
- Champions League: +3 points
- La Liga: +2 points
- Club is Barça or Madrid: +1 point
- Player is Ferran Torres or Benzema: +1 point

📝 *Example*: A news article about Ferran Torres scoring for Barça in the Champions League:
- Price: **550 €**
- Score: **10 points**

---

### 🏀 Basketball News

Additional attributes:
- **Competition** (`String`)
- **Club** (`String`)

**Price Calculation**:
- Base price: 250 €
- Euroleague: +75 €
- Club is Barça or Madrid: +75 €

**Score Calculation**:
- Base score: 4 points
- Euroleague: +3 points
- ACB: +2 points
- Club is Barça or Madrid: +1 point

---

### 🎾 Tennis News

Additional attributes:
- **Competition** (`String`)
- **Players** (`String`)

**Price Calculation**:
- Base price: 150 €
- Player is Federer, Nadal, or Djokovic: +100 €

**Score Calculation**:
- Base score: 4 points
- Player is Federer, Nadal, or Djokovic: +3 points

---

### 🏎️ F1 News

Additional attributes:
- **Team** (`String`)

**Price Calculation**:
- Base price: 100 €
- Team is Ferrari or Mercedes: +50 €

**Score Calculation**:
- Base score: 4 points
- Team is Ferrari or Mercedes: +2 points

---

### 🏍️ Motorcycling News

Additional attributes:
- **Team** (`String`)

**Price Calculation**:
- Base price: 100 €
- Team is Honda or Yamaha: +50 €

**Score Calculation**:
- Base score: 3 points
- Team is Honda or Yamaha: +3 points

---

## 📋 Main Menu Options

1. Add new editor  
2. Remove editor  
3. Add news to an editor  
4. Remove news (requires editor and headline)  
5. Show all news per editor  
6. Calculate news score  
7. Calculate news price  

---

Feel free to expand this system by adding persistence, a GUI, or integrating with external APIs.

---

# 💻 Technologies Used

- Java
- Java Standard Library
- Maven
- Git & GitHub

---

# 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or VS Code with Java and Maven support
- Git

---

# 🛠️ Installation

1. Ensure you have **JDK 21** or higher installed.
2. Clone this repository:
   ```sh
   git clone <https://github.com/DiegoBalaguer/S01.01-InheritancePolymorphism_Level03.git>
   ```
3. Open the project in your preferred IDE.
4. Compile the Java files.

---

# ▶️ Execution

1. Navigate to the folder containing the compiled files.
2. Run the application using:
   ```sh
   java Main
   ```
3. The output should display the respective messages when calling each method.

OR

1. In your preferred IDE, navigate to class **Main** and execute in IDE.

---

# 🌐 Deployment

Currently, the project is designed to run locally without the need for server deployment.

---

# CASTELLANO
___

# 📄 Descripción - Enunciado del Ejercicio

Esta aplicación simula la gestión interna de una redacción de noticias deportivas. Las noticias están clasificadas por categorías deportivas: Fútbol, Baloncesto, Tenis, F1 y Motociclismo.

## 🧑‍💼 Redactores

- La redacción puede tener múltiples redactores.
- Cada redactor tiene un **nombre**, un **DNI** y un **sueldo**.
- Una vez asignado, el **DNI no puede modificarse**.
- Todos los redactores comparten el **mismo sueldo**. Si la empresa lo aumenta, afectará a todos por igual.
- Sueldo actual: **1500 €**.

## 📰 Noticias

- Cada redactor puede trabajar en **varias noticias**.
- Cada noticia incluye:
  - Un **titular**
  - Un **texto** (inicialmente vacío)
  - Una **puntuación**
  - Un **precio**
- Existe un método `calcularPrecioNoticia()` que computa el precio según las reglas descritas abajo.

### 🏟️ Noticias de Fútbol

Atributos adicionales:
- **Competición** (`String`)
- **Club** (`String`)
- **Jugador** (`String`)

**Cálculo del precio**:
- Precio base: 300 €
- Champions League: +100 €
- Si el club es Barça o Madrid: +100 €
- Si el jugador es Ferran Torres o Benzema: +50 €

**Cálculo de la puntuación**:
- Puntuación base: 5 puntos
- Champions League: +3 puntos
- Liga: +2 puntos
- Si el club es Barça o Madrid: +1 punto
- Si el jugador es Ferran Torres o Benzema: +1 punto

📝 *Ejemplo*: Una noticia sobre Ferran Torres marcando con el Barça en la Champions:
- Precio: **550 €**
- Puntuación: **10 puntos**

---

### 🏀 Noticias de Baloncesto

Atributos adicionales:
- **Competición** (`String`)
- **Club** (`String`)

**Cálculo del precio**:
- Precio base: 250 €
- Euroliga: +75 €
- Si el club es Barça o Madrid: +75 €

**Cálculo de la puntuación**:
- Puntuación base: 4 puntos
- Euroliga: +3 puntos
- ACB: +2 puntos
- Si el club es Barça o Madrid: +1 punto

---

### 🎾 Noticias de Tenis

Atributos adicionales:
- **Competición** (`String`)
- **Jugadores** (`String`)

**Cálculo del precio**:
- Precio base: 150 €
- Si participa Federer, Nadal o Djokovic: +100 €

**Cálculo de la puntuación**:
- Puntuación base: 4 puntos
- Si participa Federer, Nadal o Djokovic: +3 puntos

---

### 🏎️ Noticias de F1

Atributos adicionales:
- **Escudería** (`String`)

**Cálculo del precio**:
- Precio base: 100 €
- Si la escudería es Ferrari o Mercedes: +50 €

**Cálculo de la puntuación**:
- Puntuación base: 4 puntos
- Si la escudería es Ferrari o Mercedes: +2 puntos

---

### 🏍️ Noticias de Motociclismo

Atributos adicionales:
- **Escudería** (`String`)

**Cálculo del precio**:
- Precio base: 100 €
- Si la escudería es Honda o Yamaha: +50 €

**Cálculo de la puntuación**:
- Puntuación base: 3 puntos
- Si la escudería es Honda o Yamaha: +3 puntos

---

## 📋 Opciones del Menú Principal

1. Añadir nuevo redactor  
2. Eliminar redactor  
3. Añadir noticia a un redactor  
4. Eliminar noticia (requiere redactor y titular)  
5. Mostrar todas las noticias por redactor  
6. Calcular puntuación de una noticia  
7. Calcular precio de una noticia  

---

Puedes ampliar este sistema añadiendo persistencia, una interfaz gráfica o integración con APIs externas.

---

# 💻 Tecnologías Utilizadas

- Java
- Biblioteca Estándar de Java
- Maven
- Git & GitHub

---

# 📋 Requisitos

Para ejecutar este proyecto, necesitas:

- Java Development Kit (JDK) 21 o superior
- Un Entorno de Desarrollo Integrado (IDE) como IntelliJ IDEA, Eclipse o VS Code con soporte para Java y Maven
- Git

---

# 🛠️ Instalación

1. Asegúrate de tener instalado **JDK 21** o superior.
2. Clona este repositorio:
   ```sh
   git clone <https://github.com/DiegoBalaguer/S01.01-InheritancePolymorphism_Level03.git>
   ```
3. Open the project in your preferred IDE.
4. Compile the Java files.

---

# ▶️ Ejecución

1. Navega hasta la carpeta que contiene los archivos compilados.
2. Ejecuta la aplicación usando:
   ```sh
   java Main
   ```
3. La salida debería mostrar los mensajes correspondientes al llamar a cada método.

O BIEN

1. En tu IDE preferido, navega hasta la clase **Main** y elecútala desde el entorno.

# 🌐 Despliegue

Actualmente, el proyecto está diseñado para ejecutarse en local sin necesidad de despliegue en servidor.

---"# S01.01-InheritancePolymorphism_Level03" 
"# S01.01-InheritancePolymorphism_Level03" 
