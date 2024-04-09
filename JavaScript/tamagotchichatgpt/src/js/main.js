let hambre = 100;
let diversion = 100;
let energia = 100;
let sueno = 0;

function alimentar(cantidad) {
  if (hambre >= 100) {
    return;
  }
  hambre += cantidad * 10;
  updateBars();
}

function jugar(cantidad) {
  if (diversion >= 100) {
    return;
  }
  diversion += cantidad * 10;
  updateBars();
}

function pelear(accion) {
  if (accion === 'Pegar') {
    // Lógica de pelea
    energia -= 20;
  } else if (accion === 'Huir') {
    // Lógica de huida
    energia -= 10;
  }
  updateBars();
}

function dormir() {
  // Lógica para dormir
  sueno += 20;
  updateBars();
}

function updateBars() {
  document.querySelector('.vida').style.width = `${hambre}%`;
  document.querySelector('.diversion').style.width = `${diversion}%`;
  document.querySelector('.energia').style.width = `${energia}%`;
  document.querySelector('.sueno').style.width = `${sueno}%`;
}
