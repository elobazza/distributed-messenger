# Distributed Messenger 👨‍👨‍👧
Sistema de chat utilizando sockets desenvolvido para a disciplina de Sistemas Paralelos e Distribuídos

**Descrição**

O projeto consiste num sistema de chat implementado para funcionar de forma distribuída, utilizando threads e sockets. No sistema em questão, o usuário tem a opção de se cadastrar e realizar o login. Depois de acessar o sistema em si, o usuário pode montar sua lista de amizade, ou seja, os contatos, através do IP dos amigos, depois de adicionar, também é possível realizar a remoção desses amigos/contatos.

Ademais, ele ainda terá a possibilidade de abrir conversas com cada um desses amigos, ao fazer isso, são abertas janelas de chat para cada bate-papo, que funcionarão simultaneamente através de threads. A comunicação será inteiramente feita no formato cliente-cliente. Cada usuário terá seus dados gravados num arquivo localmente e também um arquivo que armazena suas amizades/contatos.

**Requisitos Funcionais**

- O sistema deve permitir o gerenciamento de usuários
- O sistema deve permitir o login de usuários
- O sistema deve permitir adicionar um contato
- O sistema deve permitir remover um contato
- O sistema deve permitir troca de mensagens entre usuários

**Requisitos Não Funcionais**

- Deve ser distribuído e executar simultanamente em no mínimo 3 clientes (hosts) diferentes
- Não se deve utilizar nenhuma implementação pronta de qualquer servidor
- A comunicação pode ser realizada através de sockets
- Sockets ociosos não podem existir (todos devem ser fechados logo após a comunicação)
- A aplicação cliente deve ter interface gráfica

**Instruções de Uso 📜** 

Ao acessar o sistema pela primeira vez, o usuário deve cadastrar-se. Nas demais vezes, basta realizar o login com o username e a senha escolhidos. Quando é realizado o cadastro ou o login, o usuário é redirecionado para a página principal do sistema que possui a lista de amigos e as opções de adicionar ou remover. 

Ao clicar na opção de Adicionar, surge a tela de cadastro de amizade, onde deve ser informado o nome para o contato, o ip e a porta pela qual vão se comunicar. Ao cadastrar a nova amizade, a lista de amizades é atualizada na página principal. Ao selecionar um amigo e clicar no botão de remover, surge uma mensagem de confirmação para esse processo de remoção, o usuário tem a opção de cancelar a operação ou confirmar a remoção, depois disso é atualizado a lista de amigos da página principal.

Ao selecionar uma amizade, surge um botão Conversar na página principal, ao clicar nesse botão, é aberto uma janela de conversa com o amigo selecionado. Para que a comunicação funcione, o amigo também deve estar com a janela de conversa aberta e deve ter cadastrado a mesma porta, bem como o ip de quem deseja conversar, e claro, devem estar na mesma rede.

**Estudantes 👩🏼‍🤝‍👩🏻**

Eloísa Bazzanella e Maria Eduarda Buzana
