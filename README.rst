###############################
Kotlin Library Project Template
###############################

|badge|

This is a `Cookiecutter`_ template for creating a `Kotlin`_ library.


================
Project Features
================

- `Kotlin`_
- `Gradle`_ builds using a self-contained `Gradle Wrapper`_.
- `JUnit`_ test suite

The ``compact_dirs`` template parameter controls whether or not to use a
compact `Kotlin directory structure`_ or a traditional Java structure that
starts at the package root.


=====
Usage
=====

Install Python requirements for using the template:

.. code-block:: console

  $ python -m pip install --requirement=requirements-dev.txt


Create a new project directly from the template on `GitHub`_:

.. code-block:: console

  $ cookiecutter gh:mdklatt/cookiecutter-idea-plugin


.. |badge| image:: https://github.com/mdklatt/cookiecutter-kotlin-kib/actions/workflows/build.yml/badge.svg
    :alt: GitHub Actions CI status
.. _Cookiecutter: https://cookiecutter.readthedocs.org
.. _Kotlin: https://kotlinlang.org
.. _Gradle: https://gradle.org
.. _JUnit: https://junit.org
.. _GitHub: https://github.com/mdklatt/cookiecutter-kotlin-kib
.. _Gradle Wrapper: https://docs.gradle.org/current/userguide/gradle_wrapper.html
.. _Kotlin directory structure: https://kotlinlang.org/docs/coding-conventions.html#directory-structure
