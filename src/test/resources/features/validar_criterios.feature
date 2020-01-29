Feature: Realizar compra en la pagina metro

  @tag1
  Scenario: Validar existencia de productos
    Given loguearme en la pagina de sahitest
    |user|password|
    | test   | secret       |
    Then ingresar numero de elementos, dar clic en agregar y se valida la existencia de los productos
      |java|ruby|python|
    |  5 | 4  |  3   |

  @tag2
  Scenario: Validar Valor total
    Given loguearme en la pagina de sahitest
      |user|password|
      | test   | secret       |
    When ingresar numero de elementos, dar clic en agregar y se valida la existencia de los productos
      |java|ruby|python|
      |  3 | 4  |  3   |
    Then Se valida si la cantida porel precio unitario de todos los productos es igual al Grand Total

  @tag3
  Scenario: Validar Cierre de sesion
    Given loguearme en la pagina de sahitest
      |user|password|
      | test   | secret       |
    When dar clic en logout
    Then Se puede visulalizar la pagina de loguin