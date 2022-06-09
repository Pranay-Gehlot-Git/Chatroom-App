package com.chat.room.models;




public class Message {
    private String name;
    private String content;

    public String getName() {
        return this.name;
    }

    public Message(String name , String content){
        this.name=name;
        this.content=content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
