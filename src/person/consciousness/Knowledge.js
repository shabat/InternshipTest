class Knowledge {
    constructor(level){
        if(typeof level === 'string'){
            this.level = parseInt(level);
        }
        else{
            this.level = level;
        }
    }

    getLevel(){
        return this.level;
    }
}
module.exports = Knowledge;