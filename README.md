# rafaeldelboni/helix-scratch

Minimal Helix Scratch Template.

# TL;DR
To use this template:
```bash
    clojure -X:new :template io.github.rafaeldelboni/helix-scratch%rafaeldelboni/helix-scratch :name myusername/mynewproject
```

# Requirements

## Install deps-new
To you use this template you need to have installed `deps-new` in your workflow.

### deps-new installation
```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.10.3"}' :as new
```

## Usage

### Git Remote
```bash
  clojure -Tnew create :template io.github.rafaeldelboni/helix-scratch%rafaeldelboni/helix-scratch :name myusername/mynewproject
```

# License

Copyright © 2025 Rafael Delboni

This is free and unencumbered software released into the public domain.
For more information, please refer to http://unlicense.org
