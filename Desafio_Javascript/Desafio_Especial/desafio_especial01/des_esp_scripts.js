let num = document.querySelector('#num')
let res = document.querySelector('.result')
let elementos = document.getElementsByName('elementos')

function adicionarNum(){
    let numer = [Number(num.value)]
    if(numer == 0){
        alert('Por favor insira qualquer número!')
    } else{
        if(numer > 100 ){
            alert('Este valor é inválido! Tente Novamente')
        } else if(numer == numer){
            alert('Este valor já existe na lista')
        }
        for(let i = 0; i < numer.length; i++){
            numer[i] = numer
        }
    }
    res.innerHTML = `Elementos adicionados ${numer}`    
}