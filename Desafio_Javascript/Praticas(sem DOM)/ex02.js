var nums = [1, 2, 3, 4, 5, 7, 8, 10, 12, 15]
var maior = 0
var soma = 0
for(var i = 0; i < nums.length; i++){
    if(nums[i] % 2 == 0){
        soma = soma + nums[i]
        if(nums[i] > maior){
            maior = nums[i]
        }
    }
}
console.log(soma)
console.log(maior)