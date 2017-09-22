create sequence message_id_seq increment by 1 start with 1;

create table guestbook_message (
    message_id number not null primary key,
    guest_name varchar2(50) not null,
    password varchar2(10) not null,
    message varchar2(4000) not null
)