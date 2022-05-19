Feature: Linio
  Como usuario
  quiero ingresar a linio
  a buscar un producto y agregarlo al carrito
  para despues eliminarlo

  Scenario: validar las categorias disponibles en el menu
    Given El usuario se encuentra en la aplicacion https://www.linio.com.co
    When El usuario seleccione una categoria
    Then El usuario podra elegir un producto

