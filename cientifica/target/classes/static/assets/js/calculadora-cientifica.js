function agregar(digito){
    display = document.getElementById("display").value;
    digitos = display + digito;
    document.getElementById("display").value = digitos;
}

function limpiarDisplay(){
    document.getElementById("display").value = "";
}

function calcularResultado(){
    expresion = document.getElementById("display").value;
    resultado = eval(expresion);
    document.getElementById("display").value = resultado;
    return resultado;
}

function calcularRaizCuadrada(){
    resultado = Math.sqrt(calcularResultado());
    document.getElementById("display").value = resultado;
}

function calcularLog(){
    resultado = Math.log10(calcularResultado());
    document.getElementById("display").value = resultado;
}

function calcularPotencia(){
    const base = calcularResultado();
    const potencia = prompt("Ingresa la potencia");
    document.getElementById("display").value = Math.pow(base, potencia);
}