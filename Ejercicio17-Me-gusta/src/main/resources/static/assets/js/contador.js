// Función para manejar el "Me gusta"
function like(event) {
    const button = event.target;
    const cell = button.parentNode;
    const row = cell.parentNode;
    const table = row.parentNode;
    const imgIndex = Array.from(row.parentNode.rows[2].cells).indexOf(cell) + 1;

    fetch(`/api/posts/${imgIndex}/like`, {
        method: 'POST'
    })
    .then(response => response.text())
    .then(newCount => {
        document.getElementById(`likes${imgIndex}`).textContent = newCount;
    })
    .catch(error => {
        console.error('Error al dar like:', error);
    });
}

// Función para actualizar contadores
function updateCounters() {
    const spans = document.querySelectorAll('[id^="likes"]');

    spans.forEach(span => {
        const imgId = span.id.replace('likes', '');

        fetch(`/api/posts/${imgId}/counters`)
        .then(response => response.text())
        .then(count => {
            span.textContent = count;
        })
        .catch(error => {
            console.error(`Error actualizando contador ${imgId}:`, error);
        });
    });
}

// Inicialización
document.addEventListener('DOMContentLoaded', function() {
    // Asignar eventos a los botones
    document.querySelectorAll('input[value="Me gusta"]').forEach(btn => {
        btn.onclick = like;
    });

    // Actualizar contadores cada 3 segundos
    setInterval(updateCounters, 3000);

    // Primera actualización
    updateCounters();
});