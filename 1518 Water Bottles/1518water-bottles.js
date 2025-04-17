/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {
    var sum=numBottles;
        while(numBottles>=numExchange)
        {
            sum+=numBottles/numExchange;
            numBottles=numBottles/numExchange+(numBottles%numExchange);
        }
        return sum;
};