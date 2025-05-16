FROM gitpod/workspace-full

# Install the VS Code extension
COPY ai-testcase-generator-0.0.1.vsix /tmp/
RUN code --install-extension /tmp/ai-testcase-generator-0.0.1.vsix
