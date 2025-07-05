let converter = document.querySelector('.converter')
let res = document.querySelector('div.result')
addEventListener('click',convert)
function convert(){
    let dist = Number(window.prompt('Insira uma distância em metros(m):'))
    if(dist< 0){
        alert('Distância Inválida')
    }else{
        res.innerHTML = ''
        res.innerHTML= `<h1>A distância de ${dist}metros, corresponde...</h1>`
        res.innerHTML += `${dist/1000} quilómetros(Km)`
        res.innerHTML += `<br>${dist/100} hectômetro(Hm)`
        res.innerHTML += `<br>${dist/10} decâmetro(dam)`
        res.innerHTML += `<br>${dist/0.1} decímetro(dm)`
        res.innerHTML += `<br>${dist/0.01} centímetro(cm)`
        res.innerHTML += `<br>${dist/0.001} milímetro(mm)`
    }
    
}