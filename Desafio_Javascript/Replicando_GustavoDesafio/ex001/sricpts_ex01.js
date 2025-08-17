//Obtendo os elementos de cada elemento da DOM

let n1 = document.querySelector('#num01')
let n2 = document.querySelector('#num02')
let calcButton = document.querySelector('#calc')
//Elemento para exibir a soma
let exbsoma = document.querySelector('#exbSoma')
function calcularSoma(){
    if(n1.value === '' && n2.value === ''){
        alert('Sem número! Insira os valores nestes campos que vês')
    } else{
        //Declarando as variáveis
        let num1 = Number(n1.value)
        let num2 = Number(n2.value)
        //Somando os números
        let soma = num1 + num2;
        exbsoma.innerHTML = `A soma entre o ${num1} e ${num2} é igual à ${soma}`
    }

}