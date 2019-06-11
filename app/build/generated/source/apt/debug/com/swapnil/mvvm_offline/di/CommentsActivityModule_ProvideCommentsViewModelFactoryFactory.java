// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.swapnil.mvvm_offline.di;

import com.swapnil.mvvm_offline.domain.AddCommentUseCase;
import com.swapnil.mvvm_offline.domain.GetCommentsUseCase;
import com.swapnil.mvvm_offline.presentation.CommentsViewModelFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class CommentsActivityModule_ProvideCommentsViewModelFactoryFactory
    implements Factory<CommentsViewModelFactory> {
  private final CommentsActivityModule module;

  private final Provider<GetCommentsUseCase> getCommentsUseCaseProvider;

  private final Provider<AddCommentUseCase> addCommentUseCaseProvider;

  public CommentsActivityModule_ProvideCommentsViewModelFactoryFactory(
      CommentsActivityModule module,
      Provider<GetCommentsUseCase> getCommentsUseCaseProvider,
      Provider<AddCommentUseCase> addCommentUseCaseProvider) {
    assert module != null;
    this.module = module;
    assert getCommentsUseCaseProvider != null;
    this.getCommentsUseCaseProvider = getCommentsUseCaseProvider;
    assert addCommentUseCaseProvider != null;
    this.addCommentUseCaseProvider = addCommentUseCaseProvider;
  }

  @Override
  public CommentsViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideCommentsViewModelFactory(
            getCommentsUseCaseProvider.get(), addCommentUseCaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CommentsViewModelFactory> create(
      CommentsActivityModule module,
      Provider<GetCommentsUseCase> getCommentsUseCaseProvider,
      Provider<AddCommentUseCase> addCommentUseCaseProvider) {
    return new CommentsActivityModule_ProvideCommentsViewModelFactoryFactory(
        module, getCommentsUseCaseProvider, addCommentUseCaseProvider);
  }

  /**
   * Proxies {@link CommentsActivityModule#provideCommentsViewModelFactory(GetCommentsUseCase,
   * AddCommentUseCase)}.
   */
  public static CommentsViewModelFactory proxyProvideCommentsViewModelFactory(
      CommentsActivityModule instance,
      GetCommentsUseCase getCommentsUseCase,
      AddCommentUseCase addCommentUseCase) {
    return instance.provideCommentsViewModelFactory(getCommentsUseCase, addCommentUseCase);
  }
}