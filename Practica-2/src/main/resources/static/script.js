function mostrarMensaje() {
    const nombre = document.getElementById("nombre").value;
    document.getElementById("mensaje").textContent = `¡Hola, ${nombre}! Tu registro ha sido completado.`;
}
