// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.swapnil.mvvm_offline.di;

import com.swapnil.mvvm_offline.domain.DeleteCommentUseCase;
import com.swapnil.mvvm_offline.domain.LocalCommentRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class CommentsActivityModule_ProvideDeleteCommentUseCaseFactory
    implements Factory<DeleteCommentUseCase> {
  private final CommentsActivityModule module;

  private final Provider<LocalCommentRepository> localCommentRepositoryProvider;

  public CommentsActivityModule_ProvideDeleteCommentUseCaseFactory(
      CommentsActivityModule module,
      Provider<LocalCommentRepository> localCommentRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert localCommentRepositoryProvider != null;
    this.localCommentRepositoryProvider = localCommentRepositoryProvider;
  }

  @Override
  public DeleteCommentUseCase get() {
    return Preconditions.checkNotNull(
        module.provideDeleteCommentUseCase(localCommentRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DeleteCommentUseCase> create(
      CommentsActivityModule module,
      Provider<LocalCommentRepository> localCommentRepositoryProvider) {
    return new CommentsActivityModule_ProvideDeleteCommentUseCaseFactory(
        module, localCommentRepositoryProvider);
  }

  /** Proxies {@link CommentsActivityModule#provideDeleteCommentUseCase(LocalCommentRepository)}. */
  public static DeleteCommentUseCase proxyProvideDeleteCommentUseCase(
      CommentsActivityModule instance, LocalCommentRepository localCommentRepository) {
    return instance.provideDeleteCommentUseCase(localCommentRepository);
  }
}