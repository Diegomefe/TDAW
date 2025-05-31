// alert("Funciona el archivo jabaskrik")
// Verificar que jQuery = $ funcione
$( document ).ready(function() {
  // Handler for .ready() called.
  //Esta funcion nos permite verificar que el documento este cargado completamente
  // Imagenes, archivos, estilos, etc.
  // GET - Metodo por default
  alert("El documento esta cargado completamente")
});
function calcularOperacionAJAX(){
    //Usamos AJAX de JQUERY = $
    let operacion = document.getElementById("operacion").value;
    let numeroUno = document.getElementById("n1").value;
    let numeroDos = document.getElementById("n2").value;
    $.ajax({
        method: "POST",
        url: "/operaciones/" + operacion,
        contentType: "application/json",
        data: JSON.stringify({
            n1: numeroUno,
            n2: numeroDos
        }),
        success: function(resultadoAjax){
            if(resultadoAjax.estado == 1){
                document.getElementById("muestra_resultado").textContent = resultadoAjax.resultado;
            }else{
                alert(resultadoAjax.mensaje);
            }
        },
        error:function(xhr,status, error){
            //Error de comunicacion - algo paso
            alert(error)
        }
    });
}