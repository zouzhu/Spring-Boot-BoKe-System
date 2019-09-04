



/*用户表*/
CREATE TABLE USER(

    id INTEGER PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
    username VARCHAR(30) UNIQUE NOT NULL COMMENT '用户名',
    PASSWORD VARCHAR(30) NOT NULL COMMENT '密码',
    email VARCHAR(30) UNIQUE NOT NULL COMMENT '邮箱',
    stat INT(1) DEFAULT 0 COMMENT '激活状态',
    login_start INT(1) DEFAULT 0 COMMENT '登录状态',
    create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    beizhu VARCHAR(300) COMMENT '备注'
);


DROP TABLE USER;

/* 文章表 */
CREATE TABLE wenzhang
(
	id INTEGER PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
	title VARCHAR(300) NOT NULL COMMENT '标题',
	miaoshu VARCHAR(600) NOT NULL COMMENT '描述',
	content TEXT NOT NULL COMMENT '正文',
	img VARCHAR(512) COMMENT '图片',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	u_id INTEGER COMMENT '作者',
	CONSTRAINT user_id FOREIGN KEY(u_id) REFERENCES USER(id)
);