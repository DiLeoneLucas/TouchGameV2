# 🎮 TouchGameV2 — Jogo de Reflexo e Pontuação para Android

![Android](https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=flat&logo=androidstudio&logoColor=white)

## 📌 Sobre o projeto

O **TouchGameV2** é um jogo desenvolvido para dispositivos Android, com foco em velocidade de reação, coordenação motora e interação por meio de toques na tela.

A proposta é simples: iniciar uma partida e realizar o maior número possível de toques durante um intervalo de 15 segundos.

O aplicativo contabiliza os pontos conquistados, apresenta o resultado ao final da partida e compara a pontuação com o recorde alcançado durante a execução do aplicativo.

O projeto foi desenvolvido em Java, utilizando Android Studio e componentes da plataforma Android.

## 🎯 Objetivos

- Desenvolver um jogo simples e interativo para Android.
- Trabalhar com eventos de toque na tela.
- Implementar contagem de pontos em tempo real.
- Utilizar temporizadores para controlar a duração das partidas.
- Comparar resultados e registrar a melhor pontuação da sessão.
- Explorar recursos nativos do desenvolvimento Android.

## ⚙️ Funcionalidades

### ▶️ Iniciar partida

- Botão para iniciar uma nova partida.
- Reinicialização da pontuação.
- Inicialização automática do temporizador.
- Duração de 15 segundos por rodada.

### 👆 Sistema de pontuação

- Contabilização dos toques realizados pelo jogador.
- Atualização da pontuação durante a partida.
- Incremento de um ponto a cada interação válida.

### ⏱️ Temporizador

- Contagem regressiva de 15 segundos.
- Atualização do tempo na interface.
- Finalização automática da partida ao término do tempo.

### 🏆 Recorde

- Comparação entre a pontuação atual e a melhor pontuação.
- Atualização do recorde quando o jogador supera seu resultado anterior.
- Exibição da pontuação conquistada ao final da rodada.

### 📢 Resultado da partida

Ao finalizar uma rodada, o aplicativo apresenta uma mensagem com a pontuação alcançada pelo jogador.

## 🛠️ Tecnologias utilizadas

| Tecnologia | Aplicação |
|---|---|
| Java | Linguagem principal do aplicativo. |
| Android SDK | Desenvolvimento da aplicação Android. |
| Android Studio | Ambiente de desenvolvimento. |
| Gradle | Gerenciamento de build e dependências. |
| AndroidX AppCompat | Compatibilidade de componentes Android. |
| Material Components | Componentes visuais da interface. |
| ConstraintLayout | Organização dos elementos da interface. |
| CountDownTimer | Controle da duração das partidas. |

## 📂 Estrutura do projeto

```text
TouchGameV2/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java
