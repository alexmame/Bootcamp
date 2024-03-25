function agregarParticipante() {
    const nombreInput = document.getElementById('nombre');
    const nombre = nombreInput.value.trim();
    const participantesList = document.getElementById('participantes');

    if (nombre !== '') {
        const li = document.createElement('li');
        li.textContent = nombre;
        participantesList.appendChild(li);
        nombreInput.value = '';
    }
}

document.addEventListener('DOMContentLoaded', function() {
    const participantesList = document.getElementById('participantes');
    participantesList.addEventListener('click', function(event) {
        const participante = event.target;
        const eliminadosList = document.getElementById('eliminados');
        eliminadosList.appendChild(participante);
    });
});

