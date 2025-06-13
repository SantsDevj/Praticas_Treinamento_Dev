function comecarDesafio(){
    var nome = String(window.prompt('Qual é o seu nome?'))
    var idade = Number(window.prompt(`Olá ${nome}! Quantos anos você tem?`))
    window.alert(`Acabei de conhecer ${nome}, que tem ${idade} anos de idade!`)
}