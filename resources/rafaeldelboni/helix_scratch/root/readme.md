# {{raw-name}}
{{description}}

## Commands

### Watch Dev/Tests
Build the developer build and start shadow-cljs watching and serving main in [`localhost:8000`](http://localhost:8000) and tests in [`localhost:8100`](http://localhost:8100)
```bash
npm run watch
```

### CI Tests
Run **Karma** tests targeted for running CI tests with *Headless Chromium Driver*
```bash
npm run ci:tests
```

### Release
Build the release package to production deploy
```bash
npm run release
```
## License

Copyright © {{now/year}} {{developer}}

This is free and unencumbered software released into the public domain. For more information, please refer to http://unlicense.org
