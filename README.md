# Controllers

- every `.fxml` file can only have a **single** controller
- `fx:id` refers to controller class properties with same name, which are resolved at runtime by reflection and must be
  **public**
- `onAction` refers to controller class methods, which are resolved at runtime by reflection also and must be **public**
- Initializer
    - implements the `Initializable` interface with method `initialize`
    - used to run code directly after view is loaded
