# RPL Orçamentos PRO 8.0 — pacote único

Este ZIP contém **todos os arquivos do projeto**, inclusive `.github/workflows/android.yml`.

## Primeira instalação no GitHub (repositório novo)

1. Crie o repositório `RPL-Orcamentos-PRO` (preferencialmente privado).
2. **Extraia este único ZIP no celular** e envie o **conteúdo extraído** ao repositório, mantendo pastas e a pasta oculta `.github`. A aba Código do GitHub NÃO extrai ZIP automaticamente.
3. Confirme que `.github/workflows/android.yml`, `package.json` e `www/index.html` estão presentes no repositório.
4. Abra Actions > RPL PRO 8 - Gerar APK > Run workflow. Também inicia automaticamente em push.
5. Ao concluir com sucesso, baixe o artefato APK.

**Atenção:** o upload de pastas no navegador móvel pode ser limitado; se não conseguir manter `.github`, use um cliente Git ou computador. Um ZIP enviado fechado sozinho não ativa o GitHub Actions em um repositório vazio.

## Recursos e limitações

Interface de orçamentos, catálogo ilustrado genérico, clientes, materiais, fornecedores, PDF via jsPDF e compartilhamento via plugins Android. Preços não são cotações de mercado em tempo real. PIN local não é autenticação online. Não há sincronização multiusuário. APK debug precisa de testes reais de PDF, permissões e instalação. Não é garantido tamanho de 30 MB.
