class Group {
    constructor() {
	this.members = [];
    }

    add(value) {
	if(!this.has(value))
	    this.members.push(value);
    }

    del(value) {
	if(this.has(value))
	    this.members = this.members.filter(n => n!==value);
    }
    has(value) {
	return this.members.includes(value);
    }

    static from(list) {
	let grp = new Group;
	for(let elem of list) {
	    grp.add(elem);
	}
	return grp;
    }
}

class GroupIterator {
    constructor(grp){
	this.x = 0;
	this.group = grp;
    }

    next() {
	if(this.x >= this.group.members.length) {
	    return {done: true};
	}
	let value = {value: this.group.members[this.x]}
	this.x++;
	return {value, done:false};
    }
}

Group.prototype[Symbol.iterator] = function() {
    return new GroupIterator(this);
}


for (let value of Group.from(["a", "b", "c"])) {
  console.log(value);
}
