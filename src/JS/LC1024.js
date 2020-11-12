/**
 * @param {number[][]} clips
 * @param {number} T
 * @return {number}
 */
var videoStitching = function (clips, T) {
    let maxEnd = Array(T + 1).fill(-1);
    let hasT = false;
    for (let i = 0; i < clips.length; i++) {
        let clip = clips[i];
        if (clip[0] >= T) continue;
        maxEnd[clip[0]] = Math.max(clip[1],maxEnd[clip[0]]);
        if (clip[1] >= T) hasT = true;
    }
    if (!hasT || maxEnd[0] === -1) return -1;
    if (maxEnd[1] >= T) return 1;
    let res=1, left=1, right=maxEnd[0], max=0;
    while (left <= right)
    {
        if (maxEnd[left] > max) max=maxEnd[left];
        if (left === right) {
            right=max;
            res++;
            if (right >= T) return res;
        }
        left++;
    }
    return -1;
};