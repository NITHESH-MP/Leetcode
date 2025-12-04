/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = {};
    let need = 0;
    for(let i = 0; i < nums.length; i++){
        let need = target - nums[i];

        if(map[need] != undefined){
            let arr = [map[need], i];
            return arr;
        }
        map[nums[i]] = i;
    }

    return [0,0];
};