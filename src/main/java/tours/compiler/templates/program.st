program(class, locals_limit, stack_limit, header, main, functions) ::= <<
.class public <class>
.super java/lang/Object

.method public \<init>()V
    aload_0
    invokenonvirtual java/lang/Object/\<init>()V
    <header; separator="\n">
    return
.end method

<functions; separator="\n">

.method public static main([Ljava/lang/String;)V
    .limit locals <locals_limit>
    .limit stack <stack_limit>
    <main>
    return
.end method
>>
