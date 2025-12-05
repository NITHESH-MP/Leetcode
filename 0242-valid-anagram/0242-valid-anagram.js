/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let map = {}

    if(s.length != t.length)
        return false;

    for(let c of s)
        map[c] = (map[c] || 0) + 1;

    for(let c of t){
        if(!map[c])
            return false;
        map[c]--;
    }


    return true;
};