// My Solution
class Solution {
public int maxProduct(int[] nums) {
int temp = 0;
int abc = 0;
int xyz = 0;
if(nums.length >= 2){
for(int i = 0; i < nums.length - 1  ; i++){
for(int j =  i + 1; j <= i+ 1; j++){
temp = nums[i] * nums[j];
if(temp > abc ){
abc = temp;
// if(nums[i] > temp){
//     xyz = nums[i];
// }
// else if(nums[j] > temp){
//     xyz = nums[j];
// }
}
}
}
}
else{
return nums[0];
}
return xyz;
}
}