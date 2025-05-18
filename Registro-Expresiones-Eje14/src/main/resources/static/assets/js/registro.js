function validarFormulario() {
    const nombre = document.getElementById("nombre").value.trim();
    const apellidos = document.getElementById("apellido").value.trim();
    const rfc = document.getElementById("rfc").value.trim().toUpperCase();
    const curp = document.getElementById("curp").value.trim().toUpperCase();
    const clavePlantel = document.getElementById("clave").value.trim().toUpperCase();

    // Validaciones básicas
    if (nombre.length < 3) {
        alert("El nombre debe tener al menos 3 letras.");
        return;
    }

    if (apellidos.length < 3) {
        alert("Los apellidos deben tener al menos 3 letras.");
        return;
    }

    // RFC (13 caracteres)
    const rfcRegex = /^[A-ZÑ&]{4}\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\d|3[01])[A-Z\d]{3}$/;
    if (!rfcRegex.test(rfc)) {
        alert("El RFC no tiene un formato válido.");
        return;
    }

    // CURP
    const curpRegex = /^[A-Z]{1}[AEIOU]{1}[A-Z]{2}\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\d|3[01])[HM](AS|BC|BS|CC|CL|CM|CS|CH|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\d]{1}[0-9A-Z]{1}$/;
    if (!curpRegex.test(curp)) {
        alert("La CURP no tiene un formato válido.");
        return;
    }

    // Clave de Centro de Trabajo (CCT)
    const clavePlantelRegex = /^\d{2}[EDK](CC|JN|PB|PR|ES|TV|ST|IN)\d{4}[A-Z]$/;
    if (!clavePlantelRegex.test(clavePlantel)) {
        alert("La clave de plantel (CCT) no tiene un formato válido. Ejemplo: 09DPR1234A");
        return;
    }

    //validacion
    alert("Registro exitoso");
}