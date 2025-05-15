function esPrimo(num){
    if (num <= 1 ) return "No es primo"
    for (let i = 2; i < num; i++ ){
        if (num%i == 0){
            return "No es primo"
        }
    }
    return "Es primo"
}

function esPar(num){
    if (num%2 != 0){
        return "No es par";
    }else{
        return "Es par";
    }
}

function facto(num){
    resultado = 1;
    for (let i = 1; i <= num; i++){
        resultado *= i;
    }
    return resultado;
}

function sumaPares(num){
    if (num < 2) return 0;
    resultado = 0;
    for (let i = 2; i <= num; i+=2){
            resultado += i;
        }
    return resultado;
}

function sumaImpares(num){
    if (num < 1) return 0;
    resultado = 0;
    for (let i = 1; i <= num; i+=2){
            resultado += i;
        }
    return resultado;
}

function cambiarNombre(){
    select = document.getElementById("opc").value;
    boton = document.getElementById("boton");
    if (select == "primo" || select == "par"){
        boton.textContent = "Verificar";
    }else{
        boton.textContent = "Calcular";
    }
}

function seleccion(){
    opc = document.getElementById("opc").value
    num = document.getElementById("display").value;
    switch(opc){
        case "primo":
            resultado = esPrimo(num);
            break;
        case "par":
            resultado = esPar(num);
            break;
        case "facto":
            resultado = facto(num);
            break;
        case "sumapar":
            resultado = sumaPares(num);
            break;
        case "sumaimpa":
            resultado = sumaImpares(num);
            break;
        default:
            resultado = "Seleccione una opcion"
    }
    document.getElementById("Resultado").textContent = resultado;

}
