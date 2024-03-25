document.addEventListener("DOMContentLoaded", function() {
  const buttonEliminar = document.querySelector(".button-85");
  const listaParticipantes = document.querySelector(".participantes");
  const listaEliminados = document.querySelector(".eliminados");

  class Participante {
    constructor(nombre, participacion) {
      this.nombre = nombre;
      this.participacion = participacion;
    }
  }

  class Sorteo {
    constructor(participantes) {
      this.participantes = participantes;
      this.eliminados = [];
    }

    ejecutarSorteo() {
      // Actualizar la lista de participantes
      this.actualizarParticipantesDOM();

      // Filtrar participantes activos
      const participantesActivos = this.participantes.filter(participante => participante.participacion);

      // Si no hay participantes activos, salir
      if (participantesActivos.length === 0) {
        console.log("No hay participantes activos para el sorteo.");
        return;
      }

      // Seleccionar un participante al azar
      const indiceGanador = Math.floor(Math.random() * participantesActivos.length);
      const ganador = participantesActivos[indiceGanador];

      // Marcar al participante como eliminado y moverlo a la lista de eliminados
      ganador.participacion = false;
      this.eliminados.push(ganador);

      // Actualizar el DOM
      this.actualizarDOM();

      // Verificar si queda solo un participante activo y deshabilitar el botón si es así
      if (this.participantes.filter(participante => participante.participacion).length === 1) {
        buttonEliminar.disabled = true;
      }
    }

    actualizarParticipantesDOM() {
      listaParticipantes.innerHTML = "<h2>Participantes</h2>";
      this.participantes.forEach(participante => {
        if (participante.participacion) {
          const elemento = document.createElement("div");
          elemento.textContent = participante.nombre;
          listaParticipantes.appendChild(elemento);
        }
      });
    }

    actualizarEliminadosDOM() {
      listaEliminados.innerHTML = "<h2>Eliminados</h2>";
      this.eliminados.forEach(eliminado => {
        const elemento = document.createElement("div");
        elemento.textContent = eliminado.nombre;
        listaEliminados.appendChild(elemento);
      });
    }

    actualizarDOM() {
      this.actualizarParticipantesDOM();
      this.actualizarEliminadosDOM();
    }
  }

  const nombresParticipantes = [
    new Participante("Sergi", true),
    new Participante("Sergio", true),
    new Participante("Alex", true),
    new Participante("Sara", true),
    new Participante("Moha", true),
    new Participante("Adri", true),
    new Participante("David", true),
    new Participante("Albert", true),
    new Participante("Thirza", true),
    new Participante("Shere", true),
    new Participante("Aitor", true),
    new Participante("Eric", true)
  ];

  const sorteo = new Sorteo(nombresParticipantes);

  buttonEliminar.addEventListener("click", function() {
    sorteo.ejecutarSorteo();
  });

  sorteo.actualizarDOM();

  // Verificar si queda solo un participante activo al cargar la página y deshabilitar el botón si es así
  if (sorteo.participantes.filter(participante => participante.participacion).length === 1) {
    buttonEliminar.disabled = true;
  }
});
