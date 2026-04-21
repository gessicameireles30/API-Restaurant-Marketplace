# 🍽️ Restaurant Marketplace API  
**AnotaAi Backend Challenge**

API desenvolvida utilizando **Java + Spring Boot**, integrada com **AWS SQS**, **MongoDB** e **AWS S3**.

Este microserviço foi criado como solução para o desafio backend da AnotaAi e também utilizado como demonstração prática em conteúdo para YouTube.

---

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- MongoDB
- AWS SQS (Simple Queue Service)
- AWS S3 (Simple Storage Service)
- Maven
- Docker

---

## 📋 Sumário

- [Instalação](#-instalação)
- [Configuração](#-configuração)
- [Uso](#-uso)
- [Endpoints da API](#-endpoints-da-api)
- [Banco de Dados](#-banco-de-dados)


---

## ⚙️ Instalação

Clone o repositório:

```bash
git clone https://github.com/Fernanda-Kipper/desafio-anotaai-backend.git

cd desafio-anotaai-backend

mvn clean install

🔧 Configuração

Configure as variáveis de ambiente da AWS no arquivo application.properties:

aws.region=us-east-1
aws.accessKeyId=${AWS_KEY_ID}
aws.secretKey=${AWS_SECRET}

Defina os valores:

AWS_KEY_ID=SEU_ACCESS_KEY
AWS_SECRET=SEU_SECRET_KEY

🗄️ Banco de Dados

Suba o MongoDB com Docker:

docker compose up -d

Acesse o Mongo Express:

http://localhost:8081

Credenciais padrão:

usuário: admin
senha: pass

Crie um banco chamado:

product-catalog

▶️ Uso

Inicie a aplicação:

mvn spring-boot:run

A API estará disponível em:

http://localhost:8080

📡 Endpoints da API
🛒 Produto
Método	Endpoint	Descrição
POST	/api/product	Criar produto
GET	/api/product	Listar produtos
PUT	/api/product/{id}	Atualizar produto
DELETE	/api/product/{id}	Deletar produto

📥 Exemplo de Body (Produto)
{
  "title": "Produto para postar no tópico",
  "description": "",
  "ownerId": "4444444",
  "categoryId": "659d558b0304df732ddd4587",
  "price": 10000
}

📂 Categoria
Método	Endpoint	Descrição
POST	/api/category	Criar categoria
GET	/api/category	Listar categorias
PUT	/api/category/{id}	Atualizar categoria
DELETE	/api/category/{id}	Deletar categoria

📥 Exemplo de Body (Categoria)
{
  "id": "393948882828",
  "title": "Teste",
  "description": "",
  "ownerId": "4444444"
}
