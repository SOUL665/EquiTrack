# Coding Rules

This `coding-rules.md` file is designed to be added to the root of your repository. It establishes clear expectations for contributors and reviewers to ensure consistency, maintainability, and code quality.

***

# Coding Rules & Review Expectations

This document outlines the standards expected for all contributions to this repository. All contributors are expected to follow these guidelines to ensure code quality, readability, and maintainability.

## 1. General Principles
*   **Keep it Simple (KISS):** Avoid over-engineering. Solutions should be as simple as possible but not simpler.
*   **Don't Repeat Yourself (DRY):** Extract duplicated logic into reusable functions, constants, or modules.
*   **Readability First:** Code is read more often than it is written. Prioritize clarity over cleverness.
*   **Leave it Cleaner:** Follow the "Boy Scout Rule"—always leave the code cleaner than you found it.

## 2. Pull Request (PR) Expectations
*   **Atomic Commits:** Each PR should address one specific feature, bug fix, or refactor. Keep PRs small and focused to facilitate easier reviews.
*   **Descriptive Titles & Bodies:** Use the PR description to explain *why* the change is necessary, not just *what* was changed.
*   **Self-Review:** Before requesting a review, verify that you have:
    *   Tested the change locally.
    *   Verified that all existing tests pass.
    *   Cleaned up dead code and console logs.
*   **Continuous Integration:** PRs will only be merged if all CI pipelines pass.

## 3. Code Style & Standards
*   **Formatting:** Follow the standard style guides for the languages used in this project. Use automated formatters (e.g., Prettier, Black, Gofmt) wherever available.
*   **Naming Conventions:**
    *   Use descriptive, intention-revealing names for variables, functions, and classes.
    *   Avoid abbreviations unless they are standard (e.g., `id`, `url`).
*   **Documentation:**
    *   Write docstrings for public-facing functions/APIs.
    *   Comment the "Why," not the "What." (If the code is complex, explain the intent behind the logic).
*   **Error Handling:** Never swallow errors. Log them appropriately or propagate them to a level where they can be handled.

## 4. Review Guidelines
### For Reviewers:
*   **Be Kind and Constructive:** Focus on the code, not the person. Use phrases like "Have you considered..." or "What do you think about..." rather than "You should..."
*   **Prioritize Critical Issues:** Distinguish between bugs/security risks and matters of personal preference. Use "Nitpick" for non-blocking suggestions.
*   **Verify Requirements:** Check that the PR actually solves the ticket/issue it is linked to.

### For Authors:
*   **Respond to All Comments:** Acknowledge feedback, even if you disagree. If you disagree, explain why.
*   **Don't Take it Personally:** Code reviews are a tool for quality assurance, not a judgment of your ability as a developer.
*   **Address Feedback Promptly:** If a PR sits stale for too long, it may be closed to keep the project moving.

## 5. Security
*   **Never commit secrets:** Passwords, API keys, and environment-specific tokens must never be hardcoded or committed to the repository. Use environment variables or secret management tools.
*   **Sanitize Inputs:** Always treat external data as untrusted. Sanitize inputs to prevent injection attacks.

---

*By contributing to this repository, you agree to uphold these standards.*
