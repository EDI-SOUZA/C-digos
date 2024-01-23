alert("Boas vindas ao número do jogo secreto");
let numeroSecreto = 5;
let chute = prompt("Escolha um número entre 1 e 30");

if (chute == numeroSecreto) {
    alert("Isso ai! Você descobriu o número secreto " + numeroSecreto);
}else{
    alert("Você errou!")
}
