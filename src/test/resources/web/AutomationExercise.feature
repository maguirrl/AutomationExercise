#language: es

@AUTOMATIONEXERCISE
Característica: Inicio de sesión
  Como usuario cliente quiero iniciar sesión
  Para poder comprar productos

  @AE_INICIOSESION_EXITOSO
  Esquema del escenario: Caso 01 - Iniciar sesión de forma exitosa
    Dado estoy en la pagina web Automation Exercise "<NAVEGADOR>"
    Y ingreso el correo "<sCorreo>"
    Cuando ingreso la contraseña "<sContrasena>"
    Entonces en la pantalla principal deberia mostrarme mi nombre de usuario

    Ejemplos:
      | NAVEGADOR | sCorreo | sContrasena |
      | edge      | ntt@ntt | ntt         |

  @AE_INICIOSESION_FALLIDO
  Esquema del escenario: Caso 02 - Iniciar sesión de forma fallida
    Dado estoy en la pagina web Automation Exercise "<NAVEGADOR>"
    Y ingreso el correo "<sCorreo>"
    Cuando ingreso la contraseña "<sContrasena>"
    Entonces en el inicio de sesión deberia mostrarme un error de credenciales

    Ejemplos:
      | NAVEGADOR | sCorreo | sContrasena |
      | edge      | ttt@ttt | ntt         |