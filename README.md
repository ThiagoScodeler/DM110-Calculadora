# Exercício DM110-Calculadora - Desenvolvimento Java EE

### Recursos
#### Somar

**- Method:**
```sh
GET
```

**- URL:**
/context-root/rest/calc/sum

**- URL Params (Required):**
```sh
first (parâmetro de query)
second (parâmetro de query)
```

**- URL Example:**
```sh
http://localhost:8080/calculadora/rest/calc/sum/?first=1&second=2
```

**- Success Response:**

**Code:** 200 OK
**Response Content:**
```sh
{ "first": "1", "second": "2", "result": "3" }
```

**- Sample Call:**
```sh
curl -X GET \
  'http://localhost:8080/calculadora/rest/calc/sum/?first=1&second=2' \
  -H 'content-type: application/json'
```

#### Subtrair

**- Method:**
```sh
POST
```

**- URL:**
/context-root/rest/calc/subtract

**- Form Params (Required):**
```sh
first (parâmetro de formulário)
second (parâmetro de formulário)
```

**- URL Example:**
```sh
http://localhost:8080/calculadora/rest/calc/subtract
```

**- Success Response:**

**Code:** 200 OK
**Response Content:**
```sh
{ "first": "6", "second": "4", "result": "2" }
```

**- Sample Call:**
```sh
curl -X POST \
  http://localhost:8080/calculadora/rest/calc/subtract/ \
  -H 'content-type: application/x-www-form-urlencoded' \
  -d 'first=6&second=4'
```