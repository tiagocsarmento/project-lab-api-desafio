# Diagrama de Classes

``` mermaid
classDiagram
    class Client {
        - name: String
        - project: Project
    }

    class Project {
        - name: String
        - designer: String
        - status: String
        - interiorProject: InteriorProject
    }

    class InteriorProject {
        - ambient_1: InteriorAmbient
        - ambient_2: InteriorAmbient
    }

    class InteriorAmbient {
        - name: String
        - plastering: Plastering
    }

    class Plastering {
        - floor: String
        - walls: String
        - ceiling: String
    }

    Client -- Project
    Project -- InteriorProject
    InteriorProject -- InteriorAmbient
    InteriorAmbient -- Plastering
```
