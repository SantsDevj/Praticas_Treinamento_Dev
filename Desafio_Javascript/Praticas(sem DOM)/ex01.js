var num1 = 12
var num2 =  13
var opcao = ''
switch(opcao){
    case 1:
        var soma = num1 + num2
        console.log(`A soma é igual à ${soma}`)
        break
    case 2:
        var sub = num1 - num2
        console.log(`A subtracão é igual à ${sub}`)
        break
    case 3:
        var multi = num1 * num2
        console.log(`A Multiplicação é igual à ${multi}`)
        break
    case 4:
        var div = (num1/num2)
        console.log(`A divisão é igual à ${div}`)
        break
    
    default:
        console.log('Opção inváldas')
        break
    
}

