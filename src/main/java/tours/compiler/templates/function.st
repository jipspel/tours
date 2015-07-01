function(locals_limit, stack_limit, return_type, function_name, argument_types, block) ::=
<<
.method public static <function_name>(<argument_types>)<return_type>
    .limit locals <locals_limit>
    .limit stack <stack_limit>
    <block; separator="\n">
.end method
>>