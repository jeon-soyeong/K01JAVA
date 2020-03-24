
/* Drop Tables */

DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board
(
	idx  number NOT NULL,
	title varchar2(200),
	contents varchar2(2000),
	postdate date DEFAULT sysdate,
	id varchar2(30),
	PRIMARY KEY (idx)
);


CREATE TABLE member
(
	id varchar2(30) NOT NULL,
	pass varchar2(50) NOT NULL,
	name varchar2(40) DEFAULT '¹«±â¸í',
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE board
	ADD FOREIGN KEY (id)
	REFERENCES member (id)
;



