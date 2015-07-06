program(class, main, functions) ::= <<
.class public <class>
.super java/lang/Object

.method public \<init>()V
    aload_0
    invokenonvirtual java/lang/Object/\<init>()V
    return
.end method

<functions; separator="\n">

<main>
>>
