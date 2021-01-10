### Chain of Responsibility

wiki:

In object-oriented design, the chain-of-responsibility pattern is a design pattern 
consisting of a source of command objects and a series of processing objects.
 
Each processing object contains logic that defines the types of command objects 
that it can handle; the rest are passed to the next processing object in the chain.

责任链模式

为了避免请求发送者和多个请求处理者耦合在一起，责任链模式中包含多个请求处理者(通过引用链接)，
每个请求处理者处理能处理的部分，其他不能处理的发送给下一个处理者处理

